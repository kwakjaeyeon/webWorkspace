/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-07-02 05:50:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"/web04/img/bg.png\">\r\n");
      out.write("<table width=\"1024\" align=\"center\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"6\" bgcolor=\"white\"><img src=\"/web04/img/logo.png\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#cccccc\">&nbsp;</td>\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/\">[HOME]</a></td>\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/bbs/list.jsp\">[B B S]</a></td>\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/emp/list.jsp\">[E M P]</a></td>\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/login/form.jsp\">[LOGIN]</a></td>\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#cccccc\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"6\" bgcolor=\"white\">\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t<h1>게시판</h1>\r\n");
      out.write("\t\t\t<table width=\"90%\" border=\"1\" cellspacing=\"0\" >\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"80\">글번호</th>\r\n");
      out.write("\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"100\">글쓴이</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"100\">날짜</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");

	String key=request.getParameter("key");
	String word=request.getParameter("word");
	if(key==null)key="sub";
	if(word==null)word="";
	//String sql="select num,sub,id,nalja from bbs01 where "+key+" like '%"+word+"%' order by num desc";
	String sql="select num,sub,id,nalja from bbs01 where "+key+" like '%"+word+"%' and num<5 order by num desc";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Class.forName(driver);
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){

      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getInt(1) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getDate(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");

		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}

      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<form action=\"list.jsp\">\r\n");
      out.write("\t\t\t\t<select name=\"key\">\r\n");
      out.write("\t\t\t\t\t<option value=\"sub\">제목</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"id\">글쓴이</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"word\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<a href = \"add.jsp\">[입 력]</a>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"gray\" ></td>\r\n");
      out.write("\t\t<td bgcolor=\"gray\" colspan=\"4\">\r\n");
      out.write("\t\t\t비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>\r\n");
      out.write("\t\t\tCopyright (c) 비트캠프 All rights reserved.\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td bgcolor=\"gray\" ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
