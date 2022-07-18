package co.carboni.prj.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.carboni.prj.system.mapper.SysinfoMapper;
import co.carboni.prj.system.vo.SystemVO;



public class SysInfoServiceImpl implements SysinfoService{


	
	@Autowired
	public SysinfoMapper map;
	

	@Override
	public List<SystemVO> selectSysAll() {
		return map.selectSysAll();
	}
	
	@Override
	public List<SystemVO> selectSysDetAll() {
		return map.selectSysDetAll();
	}
	
	
	@Override
	public int systemInsert(SystemVO vo) {
		return map.systemInsert(vo);
	}
	
	@Override
	public int systemDelete(SystemVO vo) {
		return map.systemDelete(vo);
	}
	
	@Override
	public int systemUpdate(SystemVO vo) {
		return map.systemUpdate(vo);
	}
	
	
	@Override
	public int sysmanInsert(SystemVO vo) {
		return map.sysmanInsert(vo);
	}
	
	
	@Override
	public int sysmanDelete(SystemVO vo) {
		return map.sysmanDelete(vo);
	}
	
	
	@Override
	public int sysmanUpdate(SystemVO vo) {
		return map.sysmanUpdate(vo);
	}

}
