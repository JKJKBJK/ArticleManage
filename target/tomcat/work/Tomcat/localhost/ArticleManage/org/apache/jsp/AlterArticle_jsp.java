/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-12-30 03:33:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.it.domain.Article;

public final class AlterArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link href=\"css/bootstrap-combined.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"ckeditor/ckeditor.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        window.onload = function()\r\n");
      out.write("        {\r\n");
      out.write("            CKEDITOR.replace( 'description');\r\n");
      out.write("        };\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.article.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\").attr(\"selected\",true)\r\n");
      out.write("            $(\"#sub\").click(function () {\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        type: \"post\", // 以post方式发起请求\r\n");
      out.write("                        url: \"AlterArticleServlet\", // 你的请求链接\r\n");
      out.write("                        data: { // 提交数据\r\n");
      out.write("                            \"articleName\":$(\"#articleName\").val(),\r\n");
      out.write("                            \"type\":$(\"#select\").val(),\r\n");
      out.write("                            \"text\": CKEDITOR.instances.description.getData(), // 前者为字段名，后者为数据\r\n");
      out.write("                        },\r\n");
      out.write("                        success:function (data) {\r\n");
      out.write("                            // data为返回值\r\n");
      out.write("\r\n");
      out.write("                            if (data.flag){\r\n");
      out.write("                            alert(\"恭喜你修改成功！\")\r\n");
      out.write("                            }\r\n");
      out.write("                            else {\r\n");
      out.write("                                alert(data.errorMessage)\r\n");
      out.write("\r\n");
      out.write("                            }\r\n");
      out.write("                            // 成功后的回调方法\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                return false\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<button class=\"btn btn-link\" type=\"button\" onclick=\"window.history.back(-1)\" style=\"margin-left: 22px;font-size: 18px\"   >返回</button>\r\n");
      out.write("<form method = \"get\" action = \"AlterArticleServlet\">\r\n");
      out.write("    <p style=\" margin-left: 259px;\">\r\n");
      out.write("        <span style=\"font-size: 20px\">文章名：</span>\r\n");
      out.write("        <input type=\"text\" name=\"articleName\" id=\"articleName\" style=\"height: 28px;\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.article.articleName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("></p>\r\n");
      out.write("    <p style=\"width: 400px;height: 60px; margin-left: 240px\">\r\n");
      out.write("        <span style=\" font-size: 20px;\">\r\n");
      out.write("            文章类型：\r\n");
      out.write("        </span>\r\n");
      out.write("        <select  style=\"width: 205px\" id=\"select\" >\r\n");
      out.write("        <option id=\"议论文\">议论文</option>\r\n");
      out.write("        <option id=\"散文\" >散文</option>\r\n");
      out.write("        <option id=\"3\">说明文</option>\r\n");
      out.write("        <option id=\"记叙文\">记叙文</option>\r\n");
      out.write("        <option id=\"小说\" >小说</option>\r\n");
      out.write("        <option id=\"诗歌\">诗歌</option>\r\n");
      out.write("        <option id=\"应用文\">应用文</option>\r\n");
      out.write("    </select></p>\r\n");
      out.write("    <p style=\"width: 1000px\">\r\n");
      out.write("      <textarea name=\"description\" id=\"description\"  >\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.article.text}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("      </textarea>\r\n");
      out.write("        <button type=\"submit\" class=\"btn\" id=\"sub\" style=\"margin-left: 422px;margin-top: 30px\">修改</button>\r\n");
      out.write("  </p>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
