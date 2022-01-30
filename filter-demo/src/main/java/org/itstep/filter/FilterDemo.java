package org.itstep.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        System.out.println("Request URI: " + req.getRequestURI());
        //resp.sendRedirect("http://itstep.dp.ua");
        filterChain.doFilter(servletRequest, servletResponse);
        //resp.getWriter().println("<h1>doFilter</h1>");
    }

    @Override
    public void destroy() {

    }
}
