package co.carboni.prj.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.carboni.prj.sales.mapper.SalesMapper;
import co.carboni.prj.sales.vo.SalesVO;

@RestController
public class SalesServiceImpl implements SalesService {
	
	@Autowired
	SalesMapper mapper;

	//수주관리
	
		//수주관리 > 수주목록 삭제
		@Override
		public void findDelCnList(SalesVO vo) {
			mapper.findDelCnList(vo);
		}
		
		//수주관리 > 수주일자조회
		@Override
		public List<SalesVO> findCndateList(String startDt, String endDt, String cusCode, String goodsCode) {
			return mapper.findCndateList(startDt, endDt, cusCode, goodsCode);
		}
		
		//수주관리 > 거래처모달 전체조회
		@Override
		public List<SalesVO> findAllCsList(SalesVO vo) {
			return mapper.findAllCsList(vo);
		}
		
		//수주관리 > 거래처모달 검색조회
		@Override
		public List<SalesVO> findCsList(String csname) {
			return mapper.findCsList(csname);
		}
		
		//수주관리 > 제품모달 전체조회
		@Override
		public List<SalesVO> findAllGiList(SalesVO vo) {
			return mapper.findAllGiList(vo);
		}
		
		//수주관리 > 제품모달 검색조회
		@Override
		public List<SalesVO> findGiList(String giname) {
			return mapper.findGiList(giname);
		}
	
		//생산의뢰관리
		
			//생산의뢰관리 > 생산의뢰 조회
			@Override
			public List<SalesVO> findPrcloseList(String startCd, String endCd, String startPr, String endPr, String gsCode, String complete) {
				return mapper.findPrcloseList(startCd, endCd, startPr, endPr, gsCode, complete);
			}
			
			//생산의뢰관리 > 생산의뢰 삭제
			public void findDelPrList(SalesVO vo) {
				mapper.findDelPrList(vo);
			}
			
			//생산의뢰관리 > 수주일자조회
			@Override
			public List<SalesVO> findPcndateList(String startDt, String endDt) {
				return mapper.findPcndateList(startDt, endDt);
			}
			
			//생산의뢰관리 > 생산의뢰등록
			@Override
			public void prodReqInsert(List<SalesVO> allreq) {
				for (SalesVO vo : allreq) {
					mapper.prodReqInsert(vo);
					mapper.updateCnStat(vo);
					
				}
			}
		
		//제품재고관리
		
			//제품재고관리 > 제품재고 조회
			@Override
			public List<SalesVO> findStkList(String gssCode) {
				return mapper.findStkList(gssCode);
			}
			
			//제품재고관리 > 제품재고 삭제
			@Override
			public void findDelGsmList(SalesVO vo) {
				mapper.findDelGsmList(vo);
			}
		
			//제품재고관리 > 제품재고등록 제품검색조회
			@Override
			public List<SalesVO> findStkProdList(String addStk) {
				return mapper.findStkProdList(addStk);
			}
		
			//제품재고관리 > 제품재고등록 제품전체조회
			@Override
			public List<SalesVO> findAllStkProdList(SalesVO vo) {
				return mapper.findAllStkProdList(vo);
			}
			
			//제품재고관리 > 제품재고등록
			@Override
			public void goodsStkInsert(List<SalesVO> allstk) {
				for (SalesVO vo : allstk) {
					mapper.goodsStkInsert(vo);
					mapper.updateStkStat(vo);
				}
			}
			
		//출하관리
			
			//출하관리 > 생산의뢰 조회
			@Override
			public List<SalesVO> findShipList(String startCp, String endCp, String startSd, String endSd, String gsCode){
				return mapper.findShipList(startCp, endCp, startSd, endSd, gsCode);
			}
			
			//출하관리 > 출하목록 삭제
			public void findDelShList(SalesVO vo) {
				mapper.findDelShList(vo);
			}
			

			
			
		

		
		//배송관리
}
