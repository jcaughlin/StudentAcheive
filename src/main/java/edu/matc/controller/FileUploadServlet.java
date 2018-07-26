package edu.matc.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

// #TODO Where to store images
// #TODO Add Google API to validate image
// #TODO Where to Route User
@WebServlet(name = "PhotoFileUploadServlet", urlPatterns = "/uploadFile")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    public void init() throws ServletException {
        ServletContext servletContext = getServletContext();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Made it to the photo upload servlet");

        String theFilePath = "/Users/josephcaughlin/Documents/EnterpriseJava/images";
        String filePath = theFilePath;
        logger.info("File Path: " + filePath);
        Part filePart = request.getPart("image-file");
        logger.info("FilePart: " + filePart.toString());
        String fileName = getFileName(filePart);

        String uploadSuccess = "Your image was successfully uploaded and you are ugly...Just Kidding";
        String uploadFailed = "Your image was not uploaded. Please Try again";

        OutputStream outputStream = null;
        InputStream fileContent = null;


        String url = "/user-file-update-success.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


    /**
     *
     * @param part
     *
     * @return
     */
    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        String[] items = partHeader.split(";");
        for (String content : items) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf("=") + 1, content.length() - 1);
            }
        }
        return null;
    }
} // End Servlet
    
    
    
    
    
