package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.Employee;
import in.ineuron.util.HibernateUtil;

public class GeneratorApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		
		boolean flag=false;
		
		try {
			
			session = HibernateUtil.getSession();
			if (session != null) 
				transaction=session.beginTransaction();
				if (transaction != null) {
					Employee employee=new Employee();
					employee.setEmpId(1);
					employee.setEmpName("rupesh");
					employee.setEmpSal(16055.35);
					Integer id = (Integer)session.save(employee);
					System.out.println("The id of the student is :: "+id);
					flag = true;
				}
				
			
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			    if(flag) {
			    	transaction.commit();
			    	System.out.println("Object saved successfully...");
			    }else {
			    	transaction.rollback();
			    	System.out.println("Object failed to Save...");
			    }
			    HibernateUtil.closeSession(session);
			}

	}

}
