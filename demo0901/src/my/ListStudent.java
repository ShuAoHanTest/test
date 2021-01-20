package my;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import af.web.restful.AfSimpleREST;

@WebServlet("/ListStudent")
public class ListStudent extends AfSimpleREST
{
	@Override
	protected Object execute(HttpServletRequest request, 
			HttpServletResponse response, JSONObject jreq)
					throws Exception 
	{
		List<Student> list = DataSource.i.list;
		//直接把List转成JSONArray,要求是List内的元素是POJO
		JSONArray jresp = new JSONArray(list);
		//服务器的返回值应该是JSON格式的字符串或者null
		return jresp;
	}

}
