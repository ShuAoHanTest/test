package my;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import af.web.restful.AfSimpleREST;

@WebServlet("/AddStudent")
public class AddStudent extends AfSimpleREST
{
//	excute的作用是对前端的jreq内容进行处理，方法的返回值如果非null会作为JSON数据应答返回给前端
	@Override
	protected Object execute(HttpServletRequest request, 
			HttpServletResponse response, JSONObject jreq)
					throws Exception 
	{
		int id = jreq.getInt("id");
		String name = jreq.getString("name");
		boolean sex = jreq.getBoolean("sex");
		String cellPhone = jreq.getString("cellPhone");
		
		Student stu = new Student(id, name, sex, cellPhone);
		
		DataSource.i.add(stu);
		
		return null;
	}

}