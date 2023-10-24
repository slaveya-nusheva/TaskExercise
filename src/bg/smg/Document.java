package bg.smg;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<String> visitors;

    Document(){
        visitors = new ArrayList<>();
    }

    Document(List<String> arr){
        this.visitors=arr;
    }

    public List<String> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<String> visitors) {
        this.visitors = visitors;
    }
}
