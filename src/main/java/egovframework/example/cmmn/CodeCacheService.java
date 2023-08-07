package egovframework.example.cmmn;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 공통코드를 WAS 기동시 메모리에 캐싱하여 사용하도록 한다.
 * @author a
 *
 */
@Service("CodeCacheService")
public class CodeCacheService extends EgovAbstractServiceImpl {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static List<EgovMap> codeGroup = new ArrayList<EgovMap>();
	
	private static List<EgovMap> code = new ArrayList<EgovMap>();	
	
	// PostConstruct 어노테이션으로 static Code값 설정
	@PostConstruct
	public void resetCodeList() throws Exception {	
		logger.debug("resetCodeList:::::::::::::::");
	}

	// TODO code변경시 refresh호출
	public void refreshCodeList() {

	}
	

}