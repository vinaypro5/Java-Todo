package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import listener.InitListener;
import model.User;
import model.ui.UiProjectWithItems;
import services.AuthService;
import services.UiProjectService;

import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class MainPageServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = (User) req.getSession().getAttribute("user");
        UiProjectService projectService = new UiProjectService(user);

//        List<UiProjectWithItems> uiProjects = projectService.getAllUiProjects();
//        uiProjects.add(new UiProjectWithItems());
//        req.getSession().setAttribute("uiProjects", uiProjects);

        resp.setContentType("text/html;charset=UTF-8");
        req.getRequestDispatcher("main_page.jsp").forward(req, resp);
    }
}