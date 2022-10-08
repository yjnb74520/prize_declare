package com.ruoyi.system.declare.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.declare.mapper.PrizeDeclareMapper;
import com.ruoyi.system.declare.domain.PrizeDeclare;
import com.ruoyi.system.declare.service.IPrizeDeclareService;
import com.ruoyi.common.core.text.Convert;

/**
 * 参赛申报Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-08
 */
@Service
public class PrizeDeclareServiceImpl implements IPrizeDeclareService 
{
    @Autowired
    private PrizeDeclareMapper prizeDeclareMapper;

    /**
     * 查询参赛申报
     * 
     * @param declareId 参赛申报主键
     * @return 参赛申报
     */
    @Override
    public PrizeDeclare selectPrizeDeclareByDeclareId(String declareId)
    {
        return prizeDeclareMapper.selectPrizeDeclareByDeclareId(declareId);
    }

    /**
     * 查询参赛申报列表
     * 
     * @param prizeDeclare 参赛申报
     * @return 参赛申报
     */
    @Override
    public List<PrizeDeclare> selectPrizeDeclareList(PrizeDeclare prizeDeclare)
    {
        return prizeDeclareMapper.selectPrizeDeclareList(prizeDeclare);
    }

    /**
     * 新增参赛申报
     * 
     * @param prizeDeclare 参赛申报
     * @return 结果
     */
    @Override
    public int insertPrizeDeclare(PrizeDeclare prizeDeclare)
    {
        return prizeDeclareMapper.insertPrizeDeclare(prizeDeclare);
    }

    /**
     * 修改参赛申报
     * 
     * @param prizeDeclare 参赛申报
     * @return 结果
     */
    @Override
    public int updatePrizeDeclare(PrizeDeclare prizeDeclare)
    {
        return prizeDeclareMapper.updatePrizeDeclare(prizeDeclare);
    }

    /**
     * 批量删除参赛申报
     * 
     * @param declareIds 需要删除的参赛申报主键
     * @return 结果
     */
    @Override
    public int deletePrizeDeclareByDeclareIds(String declareIds)
    {
        return prizeDeclareMapper.deletePrizeDeclareByDeclareIds(Convert.toStrArray(declareIds));
    }

    /**
     * 删除参赛申报信息
     * 
     * @param declareId 参赛申报主键
     * @return 结果
     */
    @Override
    public int deletePrizeDeclareByDeclareId(String declareId)
    {
        return prizeDeclareMapper.deletePrizeDeclareByDeclareId(declareId);
    }
}
