package my;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import af.web.restful.AfSimpleREST;

@WebServlet("/TestService")
public class TestService extends AfSimpleREST
{

	@Override
	protected Object execute(HttpServletRequest request, 
			HttpServletResponse response,JSONObject jreq)
					throws Exception 
	{
		//使用JSONObject的optInt()方法   
		//取出请求参数
		int id = jreq.optInt("id");
		if(id<=0)
		{
			throw new Exception("ID必须为正值！");
		}
		
		//处理请求的部分
		
		//应答数据
		JSONObject jresp = new JSONObject();
		jresp.put("id", id);
		jresp.put("name", "舒傲寒");
		jresp.put("sex", true);
		jresp.put("cellphone", "2153151332");
		
		return jresp;
	}

}
