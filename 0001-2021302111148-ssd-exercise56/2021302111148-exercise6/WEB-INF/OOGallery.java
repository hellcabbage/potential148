import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OOGallery extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        /**
         *  Indicate the content type (for example, text/html),
         *  being returned by the response
         */
        response.setContentType("text/html");

        /**
         * 	Retrieve an output stream to use to send data to the client
         */
        PrintWriter out = response.getWriter();

        /**
         *	 Get the user input from the form
         */
        String bgrnd = request.getParameter("bgrnd");
        String theme = request.getParameter("theme");

        /**
         * 	Create an instance of the HtmlPage class
         */
        HtmlPage page1 = new HtmlPage();


        /**
         *  Set the title for the response Web page
         */
        page1.setTitle("OOGalleryForm");

        /**
         * 	Create an instance of the HtmlImage class for the first image
         */
        HtmlImage image1 = new HtmlImage(theme + "One.jpg", "img1");


        /**
         * 	Create an instance of the HtmlImage class for the second image
         */
        HtmlImage image2 = new HtmlImage(theme + "Two.jpg", "img2");


        /**
         * 	Set the attributes of the HtmlPage object
         */
        page1.setBackgroundImage(bgrnd + ".gif");

        /**
         * 	Add the images
         */
        page1.addText(image1.buildHtml());
        page1.addText(image2.buildHtml());


        /**
         *	 Construct the HTML response
         */
        out.println(page1.buildHtml());
    }
}
