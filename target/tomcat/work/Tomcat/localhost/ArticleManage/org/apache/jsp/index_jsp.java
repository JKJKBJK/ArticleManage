/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-12-29 13:48:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.jws.soap.SOAPBinding;
import com.it.domain.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head><meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <title>首页</title>\r\n");
      out.write("    <link href=\"css/layui.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"css/magicalcoder.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <script src=\"js/json3.min.js\"></script>\r\n");
      out.write("    <script src=\"js/echarts.min.js\"></script>\r\n");
      out.write("    <script src=\"js/dataTool.min.js\"></script>\r\n");
      out.write("    <script src=\"js/layui.all.js\"></script>\r\n");
      out.write("    <script src=\"js/common.js\"></script>\r\n");
      out.write("    <script src=\"js/magicalcoder.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("    #h{\r\n");
      out.write("        font-size: 40px;\r\n");
      out.write("        margin-top: 25px;\r\n");
      out.write("        font-family: cursive;\r\n");
      out.write("        letter-spacing: 20px;\r\n");
      out.write("        font-size: 40px;\r\n");
      out.write("        margin-top: 25px;\r\n");
      out.write("        font-family: cursive;\r\n");
      out.write("        letter-spacing: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    a{}\r\n");
      out.write("    #frame{\r\n");
      out.write("        width: 100.6%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    .layui-form-select dl dd {\r\n");
      out.write("        color: black;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("    #s{\r\n");
      out.write("        background-color: red;\r\n");
      out.write("    }\r\n");
      out.write("    .layui-form-select .layui-input{\r\n");
      out.write("        padding-right: 30px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("        background-color: #393D49!important;\r\n");
      out.write("        background-color: #393D49!important;\r\n");
      out.write("        border-color: #393D49!important;\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("        margin-top: 28px;\r\n");
      out.write("       color: white;\r\n");
      out.write("        margin-left: 50px;}\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function out() {\r\n");
      out.write("            var r=confirm(\"您确定要退出登录嘛？\")\r\n");
      out.write("            if (r==true){\r\n");
      out.write("                location.href=\"OutSignServlet\"\r\n");
      out.write("            }}\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#index\").click()\r\n");
      out.write("\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body  class=\"layui-form\" style=\"\">\r\n");
      out.write("<div id=\"magicalDragScene\" class=\"mc-root mc-ui-absolute-pane\" style=\"height: 508px;\">\r\n");
      out.write("    <div class=\"layui-row\" style=\"position: absolute; left: 0.398089%; top: 1.57143%; width: 14.2516%; height:700px;\">\r\n");
      out.write("        <div class=\"layui-col-xs12 layui-bg-black\" style=\"height: 140px; width: 86.6197%;\">\r\n");
      out.write("            <img style=\"width: 76%; height: 142px; margin-left: 10px \" src=\"images/logo.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-col-xs12 layui-bg-black\" style=\"height: 605px; width: 86.5%;\">\r\n");
      out.write("            <ul class=\"layui-nav\" style=\"height: 522px; width: 75%;margin-left: 20px;margin-top:25px  \">\r\n");
      out.write("                <li class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"First.jsp\" target=\"sss\" id=\"index\"  >首页</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"Article.jsp\" target=\"sss\">文章库</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li id=\"uuid94b4a816-37dd-4194-b1da-5db4ce0ba643\" class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"PersonalArticle.jsp\" target=\"sss\">个人文章</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li id=\"uuidb7babd0a-3886-4123-8963-475250b5b8fd\" class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"UpLoadArticle.jsp\" TARGET=\"sss\">文章上传</a>\r\n");
      out.write("                </li> <li  class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"AlterUser.jsp\" TARGET=\"sss\">修改信息</a>\r\n");
      out.write("                </li> <li  class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"javascript:out()\" >退出登录</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-row\" style=\"position: absolute; left: 12.4%; top: 1.5748%; width: 83.6%; height: 700px;\">\r\n");
      out.write("        <div class=\"layui-col-xs12 layui-bg-black\" style=\"height: 115px; width: 104.8%;\">\r\n");
      out.write("            <div class=\"layui-row\" style=\"height: 65px; width: 95.7711%;\">\r\n");
      out.write("                <div class=\"layui-col-md6\" style=\"width: 81.4536%; height: 66px;\">\r\n");
      out.write("                    <label class=\"layui-form-label\" style=\"width: 57.6923%; height: 29px; transform: rotate(0deg);\"><h1 id=\"h\">智极文章管理系统</h1></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-col-md6\" style=\"height: 66px;  width: 13.9098%;margin-top: 40px\">\r\n");
      out.write("                    <span style=\"font-size: 24px;margin-top: 21px;margin-left: 120px\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-col-xs12 mc-ui-absolute-pane\" style=\"height: 627px; width: 103.8%;\">\r\n");
      out.write("         <iframe width=\"100%\" height=\"100%\" name=\"sss\" id=\"frame\" src=\"First.jsp\">\r\n");
      out.write("         </iframe>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/JavaScript\">\r\n");
      out.write("    function gradeChange() {\r\n");
      out.write("        var objS = document.getElementById(\"s\");\r\n");
      out.write("        var grade = objS.options[objS.selectedIndex].value;\r\n");
      out.write("        alert(grade);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    //以下脚本为标签属性转换成layui组件的还原过程\r\n");
      out.write("    //调试:打开浏览器控制台(F12),在代码中某行增加 debugger 即可调试\r\n");
      out.write("    var $ = layui.jquery, laytpl = layui.laytpl, laydate = layui.laydate, form = layui.form, layedit = layui.layedit, slider = layui.slider, element = layui.element, colorpicker = layui.colorpicker, upload = layui.upload, rate = layui.rate, carousel = layui.carousel, table = layui.table, flow = layui.flow;\r\n");
      out.write("    var magicalDragLayuiUtil = {\r\n");
      out.write("        rebuildLayUiControls: function () {\r\n");
      out.write("            var _t = this;\r\n");
      out.write("            //日期\r\n");
      out.write("            $(\".magicalcoder-laydate\").each(function (idx, item) {\r\n");
      out.write("                laydate.render(_t.iteratorAttr({\r\n");
      out.write("                    elem: item\r\n");
      out.write("                }, item));\r\n");
      out.write("            })\r\n");
      out.write("            //富文本\r\n");
      out.write("            $(\".magicalcoder-layedit\").each(function (idx, item) {\r\n");
      out.write("                var mcDataId = $(item).attr(\"id\");\r\n");
      out.write("                if (mcDataId) {\r\n");
      out.write("                    layedit.build(mcDataId, {\r\n");
      out.write("                        height: 300\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("            //外键\r\n");
      out.write("            $(\".magicalcoder-foreign-select2\").each(function (idx, item) {\r\n");
      out.write("                var mcDataId = $(item).attr(\"id\");\r\n");
      out.write("                if (mcDataId) {\r\n");
      out.write("                    $(\"#\" + mcDataId).select2({\r\n");
      out.write("                        allowClear: true,\r\n");
      out.write("                        width: \"150px\",\r\n");
      out.write("                        delay: 500,\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("            //颜色选择器\r\n");
      out.write("            $(\".magicalcoder-color-picker\").each(function (idx, item) {\r\n");
      out.write("                colorpicker.render(_t.iteratorAttr({\r\n");
      out.write("                    elem: $(item)}, item));\r\n");
      out.write("            })\r\n");
      out.write("            //上传组件\r\n");
      out.write("            $(\".magicalcoder-layupload\").each(function (idx, item) {\r\n");
      out.write("                upload.render(_t.iteratorAttr({\r\n");
      out.write("                    elem: $(item)}, item));\r\n");
      out.write("            })\r\n");
      out.write("            //滑块\r\n");
      out.write("            $(\".magicalcoder-slider\").each(function (idx, item) {\r\n");
      out.write("                slider.render(_t.iteratorAttr({\r\n");
      out.write("                    elem: $(item)}, item));\r\n");
      out.write("            })\r\n");
      out.write("            //评分\r\n");
      out.write("            $(\".magicalcoder-rate\").each(function (idx, item) {\r\n");
      out.write("                rate.render(_t.iteratorAttr({\r\n");
      out.write("                    elem: $(item)}, item));\r\n");
      out.write("            })\r\n");
      out.write("            //轮播\r\n");
      out.write("            $(\".layui-carousel\").each(function (idx, item) {\r\n");
      out.write("                carousel.render(_t.iteratorAttr({\r\n");
      out.write("                    elem: $(item)}, item));\r\n");
      out.write("            })\r\n");
      out.write("            //流加载\r\n");
      out.write("            $(\".magicalcoder-flow\").each(function (idx, item) {\r\n");
      out.write("                flow.load(_t.iteratorAttr({\r\n");
      out.write("                    elem: $(item)}, item));\r\n");
      out.write("            })\r\n");
      out.write("            //代码\r\n");
      out.write("            $(\".magicalcoder-code\").each(function (idx, item) {\r\n");
      out.write("                layui.code(_t.iteratorAttr({\r\n");
      out.write("                    elem: $(item)}, item));\r\n");
      out.write("            })\r\n");
      out.write("            //弹窗\r\n");
      out.write("            $(\".magicalcoder-layer\").each(function (idx, item) {\r\n");
      out.write("                //先隐藏起来\r\n");
      out.write("                $(this).next().hide();\r\n");
      out.write("                $(this).click(function () {\r\n");
      out.write("                    var config = _t.iteratorAttr({\r\n");
      out.write("                        elem: $(item)}, item);\r\n");
      out.write("                    var type = config.type;\r\n");
      out.write("                    if (type + '' == 1) {\r\n");
      out.write("                        config.content = $(this).next();\r\n");
      out.write("                        if (!config.content.hasClass(\"magicalcoder-layer-content\")) {\r\n");
      out.write("                            config.content = config.content.find(\".magicalcoder-layer-content\")\r\n");
      out.write("                        }                }\r\n");
      out.write("                    if (config.btn) {\r\n");
      out.write("                        config.btn = config.btn.split(\",\")\r\n");
      out.write("                    }\r\n");
      out.write("                    if (config.area) {\r\n");
      out.write("                        config.area = config.area.split(\",\")\r\n");
      out.write("                    }\r\n");
      out.write("                    layer.open(config)\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("            //动态表格 我们单独封装了layui-table的初始化方式 至于数据排序 返回格式 等操作请根据你的具体环境自行封装\r\n");
      out.write("            $(\".magicalcoder-table\").each(function (idx,\r\n");
      out.write("                                                    item) {\r\n");
      out.write("                var cols = [];\r\n");
      out.write("                //读取列配置\r\n");
      out.write("                $(this).find(\".magicalcoder-table-th\").each(function (i, th) {\r\n");
      out.write("                    cols.push(_t.iteratorAttr({\r\n");
      out.write("                        title: $(this).text()}, th));\r\n");
      out.write("                })\r\n");
      out.write("                var tableConfig = _t.iteratorAttr({\r\n");
      out.write("                        elem: $(item),\r\n");
      out.write("                        cols: [cols]},\r\n");
      out.write("                    item);\r\n");
      out.write("                //初始化表格 至于返回的数据格式 您可以根据自己的系统自行改造 这里仅做一个示例 参考js\\\\data\\\\list.json\r\n");
      out.write("                table.render(tableConfig);\r\n");
      out.write("            })\r\n");
      out.write("            //部分组件初始化\r\n");
      out.write("            element.init();\r\n");
      out.write("            //表单初始化\r\n");
      out.write("            form.render();\r\n");
      out.write("        },\r\n");
      out.write("        //将标签上的属性 转换成layui函数初始化时的参数名:参数值\r\n");
      out.write("        iteratorAttr: function (renderConfig, dom) {\r\n");
      out.write("            var attrs = dom.attributes;\r\n");
      out.write("            for (var i = 0; i < attrs.length; i++) {\r\n");
      out.write("                var attr = attrs[i];\r\n");
      out.write("                var name = attr.name;\r\n");
      out.write("                var value = attr.value;\r\n");
      out.write("                if (name.indexOf(\"mc-\") === 0) {\r\n");
      out.write("                    name = name.replace(\"mc-attr-\", '');\r\n");
      out.write("                    name = name.replace(\"mc-event-\", '');\r\n");
      out.write("                    if (name.indexOf('str-') === 0) {\r\n");
      out.write("                        name = name.replace('str-', '');\r\n");
      out.write("                    } else if (name.indexOf('bool-') === 0) {\r\n");
      out.write("                        name = name.replace('bool-', '');\r\n");
      out.write("                        value == 'true' || value === '' ? value = true: value = value;\r\n");
      out.write("                        value == 'false' ? value = false: value = value;\r\n");
      out.write("                    } else if (name.indexOf('num-') === 0) {\r\n");
      out.write("                        name = name.replace('num-', '');\r\n");
      out.write("                        if (value !== '' && !isNaN(value)) {\r\n");
      out.write("                            value = parseFloat(value);\r\n");
      out.write("                        }\r\n");
      out.write("                    } else if (name.indexOf('json-') === 0) {\r\n");
      out.write("                        name = name.replace('json-', '');\r\n");
      out.write("                        if (value !== '') {\r\n");
      out.write("                            value = JSON.parse(value);\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    renderConfig[this.htmlAttrNameToTuoFeng(name)] = value;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            return renderConfig;\r\n");
      out.write("        },\r\n");
      out.write("        //user-name -> userName html上的标签名转换成驼峰名称\r\n");
      out.write("        htmlAttrNameToTuoFeng: function (name) {\r\n");
      out.write("            var arr = name.split(\"-\");\r\n");
      out.write("            var newArr = []\r\n");
      out.write("            for (var i = 0; i < arr.length; i++) {\r\n");
      out.write("                if (i != 0) {\r\n");
      out.write("                    if (arr[i] != '') {\r\n");
      out.write("                        newArr.push(this.firstCharToUpLower(arr[i]));\r\n");
      out.write("                    }\r\n");
      out.write("                } else {\r\n");
      out.write("                    newArr.push(arr[i]);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            return newArr.join('');\r\n");
      out.write("        },\r\n");
      out.write("        //首字母大写\r\n");
      out.write("        firstCharToUpLower: function (name) {\r\n");
      out.write("            var arr = name.split(\"\");\r\n");
      out.write("            arr[0] = arr[0].toUpperCase();\r\n");
      out.write("            return arr.join('');\r\n");
      out.write("        },\r\n");
      out.write("    }\r\n");
      out.write("    magicalDragLayuiUtil.rebuildLayUiControls();\r\n");
      out.write("    //echarts自动初始化\r\n");
      out.write("    new McECharts().render();\r\n");
      out.write("    //functions-begin\r\n");
      out.write("    //functions-end\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
