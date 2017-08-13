package ssm;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xhhy.domain.PosinBean;
import com.xhhy.service.PosinService;

import junit.framework.TestCase;



public class daoTest extends TestCase{
	
	@Autowired
	private PosinService posinService;
	
	
	public void testdao(){
		List<PosinBean> posins = posinService.selectPosinAll();
		System.out.println(posins);
		for(PosinBean p : posins){
			System.out.println(p.getPosId()+""+p.getPosDept());
		}
	}

	
	
	public PosinService getPosinService() {
		return posinService;
	}

	public void setPosinService(PosinService posinService) {
		this.posinService = posinService;
	}

}
