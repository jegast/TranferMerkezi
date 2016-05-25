package design.iterator;

import java.util.ArrayList;
import java.util.List;

public class asdn implements Cloneable {
	private List<String> empList;
	public asdn(){
		
		empList = new ArrayList<String>();
	
	}

	public asdn(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		empList.add("Yusuf");
		empList.add("Burak");
		empList.add("Anil");
		
	}
	
	public List<String> getEmpList(){
		return empList;
		
	}
	@Override
    public Object clone() throws CloneNotSupportedException{
            List<String> temp = new ArrayList<String>();
            for(String s : this.getEmpList()){
                temp.add(s);
            }
            return new asdn(temp);
    }
	
}
