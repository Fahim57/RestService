package school.model;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonValue;

public class School {
    private int code;
	private String naam;
    private String plaats;
    private List<Student> studenten = new ArrayList<Student>();

    public School(int c, String nm, String pl){
        code =c;
    	naam = nm;
        plaats = pl;
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }

    public String getPlaats() {
        return plaats;
    }
    public List<Student> getStudenten() {
        return  studenten;
    }

//    public JsonValue getStudenten() {
//        return (JsonValue) studenten;
//    }
}

