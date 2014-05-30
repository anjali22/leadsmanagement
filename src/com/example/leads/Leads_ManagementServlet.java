package com.example.leads;
import java.io.*;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Leads_ManagementServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out=resp.getWriter();
		String id=req.getParameter("userid");
		String pwd=req.getParameter("password");
		out.print(id);
		out.print(pwd);
		resp.setContentType("text/plain");
	
	
	}
}
