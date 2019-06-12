package com.jason.pattern;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jason.pattern.ploicy.*;
public class Code {
	private List<PolicyIF> policyList;

	public List<PolicyIF> getPolicyList() {
		return policyList;
	}

	public void setPolicyList(List<PolicyIF> policyList) {
		this.policyList = policyList;
	}
  	public void printsomething(){
		 System.out.println("line 1");
		 System.out.println("line 2");
		 System.out.println("line 3");
		 System.out.println("line 4");
		 System.out.println("line 5");	
	}

	public static void main(String [] agrs){
		ApplicationContext context = new ClassPathXmlApplicationContext("file:C:\\2task\\Code\\SpringAOP\\src\\applicationContext.xml");
		OperatorClass operatorClass = (OperatorClass) context.getBean("operatorClass");
		System.out.println("policyList.size " + operatorClass.getPolicyList().size());
		for(int i=0;i<operatorClass.getPolicyList().size();i++){
			operatorClass.getPolicyList().get(i).excute("parameter");
      
		}
    System.out.println("ok");
    System.out.println("ok");
    System.out.println("ok");
	}
	
}
