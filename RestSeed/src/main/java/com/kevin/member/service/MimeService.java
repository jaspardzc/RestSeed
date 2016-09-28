package com.kevin.member.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.codehaus.jettison.json.JSONObject;

import com.kevin.member.domain.User;

/**
 * Sample MIME Service
 * @author Owner
 *
 */
@Path("/mime")
public class MimeService {
	
	@POST
	@Path("/member")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public User getStaticResponse(JSONObject object) throws Exception {
		
		String firstname = object.getString("firstname");
		String lastname = object.getString("lastname");
		
		User user = null;
		
		user = new User();
		user.setDob("09/19/2016");
		user.setEmail("kevinzengdev@gmail.com");
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setMobile("520397415");
		user.setOccupation("softwware engineer");
		
		return user;
	}
	
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getImageAsPdf() throws IOException {
		
		String title = "PDF BOX TEXT CONTENT";
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		PDDocument document = new PDDocument();
		PDFont font = PDType1Font.HELVETICA;
		PDPage page = new PDPage();
		document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.setFont(font, 12);
        contentStream.beginText();
        contentStream.moveTextPositionByAmount(100, 700);
        //contentStream.drawString("PDF BOX TEXT CONTENT");

        contentStream.endText();
        contentStream.close();

		//if number of results exceeds what can fit on the first page
		page = new PDPage();
		document.addPage(page);
		
		contentStream = new PDPageContentStream(document,page);
        contentStream.setFont(font, 12);
        contentStream.beginText();
        contentStream.moveTextPositionByAmount(100, 700);
        contentStream.drawString("PDF BOX TEXT CONTENT");
        contentStream.endText();
        contentStream.close();

        document.save(bos);
        document.close();
		
		ResponseBuilder rb = Response.ok((Object) bos.toByteArray());
		
		return rb.header("Content-Disposition",  "attachment; filename=\"mySVG.pdf\"").build();
	}
}
