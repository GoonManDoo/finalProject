package co.carboni.prj.produce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.carboni.prj.produce.mapper.ProdMapper;
import co.carboni.prj.produce.vo.ProdOrderVO;
import co.carboni.prj.produce.vo.ProdPlanVO;

@RestController
@Service
public class ProdServiceImpl implements ProdService {
	
	@Autowired
	ProdMapper mapper;
	
	// 생산계획관리

		// 생산계획검색
		@Override
		public List<ProdPlanVO> searchPlan(String pstartDt, String pendDt, String pstatus) {
			return mapper.searchPlan(pstartDt, pendDt, pstatus);
		}
		
		// 생산계획 로드
		@Override
		public ProdPlanVO prodPlan(String findNum) {
			return mapper.prodPlan(findNum);
		}
		
		// 생산계획상세 로드
		@Override
		public List<ProdPlanVO> prodPlanDetail(String findDNum) {
			return mapper.prodPlanDetail(findDNum);
		}
		
		// 미생산주문조회
		@Override
		public List<ProdPlanVO> findUnprod(String startDt, String endDt) {
			return mapper.findUnprod(startDt, endDt);
		}
	
		// 생산계획에 추가할 제품 목록
		@Override
		public List<ProdPlanVO> planProduct(ProdPlanVO vo) {
			return mapper.planProduct(vo);
		}
		
		// 생산계획에서 선택한 제품의 자재목록
		@Override
		public List<ProdPlanVO> matList(String prnum) {
			return mapper.matList(prnum);
		}
		
		// 생산계획에서 부족한 자재 발주요청
		@Override
		public void requestMat(ProdPlanVO vo) {
			mapper.requestMat(vo);
		}
	
		// 생산계획등록
		@Override
		public int addProdPlan(ProdPlanVO vo) {
			mapper.addProdPlan(vo);
			return 1;
		}
		
		// 생산계획상세등록 + 수정 시 재등록
		@Override
		public void addPPlanDetail(List<ProdPlanVO> plans) {
			for (ProdPlanVO vo : plans) {
				mapper.addPPlanDetail(vo); // 계획등록
				if(vo.getPrnum() != null) {
				mapper.updatePReqStat(vo); // 생산의뢰 상태 수정
				}
			}
		}

		// 생산계획수정
		@Override
		public void updateProdPlan(ProdPlanVO vo) {
			mapper.updateProdPlan(vo);
			mapper.delupPPdetail(vo); // 수정을 위한 삭제
		}
		
		/*
		 * // 생산계획상세수정
		 * 
		 * @Override public void upPPlanDetail(List<ProdPlanVO> plans) { for (ProdPlanVO
		 * vo : plans) { mapper.upPPlanDetail(vo); } }
		 */
		
		// 생산계획삭제
		@Override
		public void removeProdPlan(ProdPlanVO vo) {
			mapper.removeProdPlan(vo);
			mapper.removePPlanDetail(vo);
		}

		
	// 생산계획관리
		
		// 미지시계획조회
		@Override
		public List<ProdOrderVO> unorderList(String startDt, String endDt) {
			return mapper.unorderList(startDt, endDt);
		}
		
		// 생산지시에 계획목록 추가
		@Override
		public List<ProdOrderVO> addPlan(ProdOrderVO vo) {
			return mapper.addPlan(vo);
		}

		// 생산라인검색
		@Override
		public List<ProdOrderVO> addLine(ProdOrderVO vo, String braidId, String moldId) {
			return mapper.addLine(vo, braidId, moldId);
		}

		

		

		
		

		


	

	

}
