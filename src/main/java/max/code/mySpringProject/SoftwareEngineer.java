package max.code.mySpringProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class SoftwareEngineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id;

    private String _name;
    private String _techStack;

    public SoftwareEngineer(){

    }

    public SoftwareEngineer(Integer id, String name, String techStack){
        _id = id;
        _name = name;
        _techStack = techStack;
    }

    public Integer get_id() {
        return _id;
    }

    public String get_techStack() {
        return _techStack;
    }

    public String get_name() {
        return _name;
    }

    public void set_id(Integer id) {
        _id = id;
    }

    public void set_techStack(String techStack) {
        _techStack = techStack;
    }

    public void set_name(String name) {
        _name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(_id, that._id) && Objects.equals(_name, that._name) && Objects.equals(_techStack, that._techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, _name, _techStack);
    }
}
