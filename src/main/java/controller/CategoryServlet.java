package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import entities.CategoryEntity;
import service.CategoryService;
import service.ICategoryService;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
    private ICategoryService categoryService = new CategoryService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("getCategories".equals(action)) {
            handleGetCategories(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
        }
    }

    private void handleGetCategories(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<CategoryEntity> categories = categoryService.findAll();

            // Create a JSON array of categories
            JsonArray categoriesJsonArray = new JsonArray();
            for (CategoryEntity category : categories) {
                JsonObject categoryJson = new JsonObject();
                categoryJson.addProperty("id", category.getId());
                categoryJson.addProperty("name", category.getName());
                categoriesJsonArray.add(categoryJson);
            }

            // Set content type and write JSON response
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.print(categoriesJsonArray);
            }
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error processing request");
            e.printStackTrace();
        }
    }
}

