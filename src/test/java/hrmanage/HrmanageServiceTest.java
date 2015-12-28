package hrmanage;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.ballchen.oa.hrmanage.model.UserBasic;
import com.ballchen.oa.hrmanage.service.IHrmanageService;

@ContextConfiguration(locations = "classpath:/spring-config/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class HrmanageServiceTest {
	
	@Autowired
	private IHrmanageService hrmanageService;
	
	@Test
	public void saveUserBasic(){
		UserBasic userBasic = new UserBasic();
		userBasic.setUserName("ChenZhao");
		userBasic.setAddDate(new Date());
		userBasic.setUserSex(0);
		userBasic.setIdNum("37152319930926001X");
		hrmanageService.saveUserBasic(userBasic);
	}

	/*-----------setter/getter------------------*/
	public IHrmanageService getHrmanageService() {
		return hrmanageService;
	}

	public void setHrmanageService(IHrmanageService hrmanageService) {
		this.hrmanageService = hrmanageService;
	}
	
	
}
