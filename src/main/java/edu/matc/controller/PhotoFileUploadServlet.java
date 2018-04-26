package edu.matc.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
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
public class PhotoFileUploadServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        final String filePath = "/Users/josephcaughlin/EnterpriseJavaSpring/images";
        final Part filePart = request.getPart("image-file");
        final String fileName = getFileName(filePart);

        String uploadSuccess = "Your image was successfully uploaded and you are ugly...Just Kidding";
        String uploadFailed = "Your image was not uploaded. Please Try again";

        OutputStream outputStream = null;
        InputStream fileContent = null;

        try {
            outputStream = new FileOutputStream(new File(filePath + File.separator
                    + fileName));
            fileContent = filePart.getInputStream();

            int read = 0;
            final byte[] bytes = new byte[2048];

            while ((read = fileContent.read(bytes)) != -1) {

                logger.info(read);
            }

            logger.info("New file " + fileName + " created at " + filePath);

            request.setAttribute("uploadSuccessMessage", uploadSuccess);


        } catch (FileNotFoundException fileNotFoundException) {

            logger.info("File Not Found" + fileNotFoundException);
            request.setAttribute("uploadFailedMessage", uploadFailed);
            response.sendRedirect("user-added-confirmation.jsp");

        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (fileContent != null) {
                fileContent.close();
            }
        }

        String url = "/user-file-update-success.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


    /**
     * FROM fileupload Example Application JAVA EE Tutorial
     * Method returns a fileName string if a valid file was found.
     *
     * @param part the filePathPart
     * @return filename
     */
    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        logger.info("Part Header = {0}", partHeader);
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    private void uploadImage() {
        logger.info("Not Testable Method!");
    }
}
    
    
    
    
    
