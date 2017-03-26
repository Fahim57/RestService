package school.services;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import school.model.School;
import school.model.Student;

@Path("/scholen")
public class SchoolResource {
    SchoolService service = ServiceProvider.getSchoolService();
    List<Student> studs = new ArrayList<Student>();
    
    @GET
	@Produces("application/json")
	public String getScholen() {
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (School s : service.getScholen()) {
			JsonObjectBuilder job = Json.createObjectBuilder();
		//	JsonObjectBuilder job2 = Json.createObjectBuilder();
			job.add("code" , s.getCode());
			job.add("naam" , s.getNaam());
			job.add("plaats" , s.getPlaats());
//			job.add("studenten", s.getStudenten());
//			studs = s.getStudenten();
//			job.add("studenten", (JsonValue)studs);
			
			JsonArrayBuilder studArr = Json.createArrayBuilder();
			for (Student st : s.getStudenten()) {
				JsonObjectBuilder stud = Json.createObjectBuilder();
				stud.add("voornaam", st.getVoornaam());
				stud.add("achternaam", st.getAchternaam());
				stud.add("leefttijd", st.getLeeftijd());
				stud.add("woonplaats", st.getWoonplaats());
				stud.add("propedeuse", st.isPropedeuse());
				studArr.add(stud);
			}
			
		//	JsonArray array = studArr.build();
			job.add("studenten", studArr);
			
			jab.add(job);
		}
		JsonArray array = jab.build();
		return array.toString();
	}
    @GET
	@Path("{code}")
	@Produces("application/json")
	public String getSchoolInfo(@PathParam("code") int code) {
		School s = service.getSchoolByCode(code);
		JsonObjectBuilder job = Json.createObjectBuilder();
		job.add("code" , s.getCode());
		job.add("naam" , s.getNaam());
		job.add("plaats" , s.getPlaats());
		
		JsonArrayBuilder studArr = Json.createArrayBuilder();
		for (Student st : s.getStudenten()) {
			JsonObjectBuilder stud = Json.createObjectBuilder();
			stud.add("voornaam", st.getVoornaam());
			stud.add("achternaam", st.getAchternaam());
			stud.add("leefttijd", st.getLeeftijd());
			stud.add("woonplaats", st.getWoonplaats());
			stud.add("propedeuse", st.isPropedeuse());
			studArr.add(stud);
		}
		job.add("studenten", studArr);
		return job.build().toString();
	}
	
    
}
