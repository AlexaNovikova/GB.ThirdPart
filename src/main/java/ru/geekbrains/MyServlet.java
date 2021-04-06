package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(MyServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().printf("<html><body>");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().printf("<h1>List of products<h1>");
        resp.getWriter().printf("<table border=3 cellpadding=10 align=left>" +
                "  <tbody>" +
                "    <tr>" +
                "      <td>ID</td>" +
                "      <td>Name</td>" +
                "      <td>Coast</td>" +
                "    </tr>");
        for (int i = 0; i < 10; i++) {
            Product newProduct = new Product(i, "Product "+ i, 10+1+i*10);
            resp.getWriter().printf("<tr>" +
                    "      <td>"+ newProduct.getId()+"</td>" +
                    "      <td>" + newProduct.getName()+"</td>" +
                    "      <td>" + newProduct.getCoast()+"</td>" +
                    "    </tr>");
        }
        resp.getWriter().printf("</tbody></table></html></body>");
    }
    @Override
    public void destroy() {
        logger.debug("Destroy");
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}
