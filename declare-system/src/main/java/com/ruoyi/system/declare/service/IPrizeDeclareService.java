package com.ruoyi.system.declare.service;

import java.util.List;
import com.ruoyi.system.declare.domain.PrizeDeclare;

/**
 * 参赛申报Service接口
 * 
 * @author ruoyi
 * @date 2022-10-08
 */
public interface IPrizeDeclareService 
{
    /**
     * 查询参赛申报
     * 
     * @param declareId 参赛申报主键
     * @return 参赛申报
     */
    public PrizeDeclare selectPrizeDeclareByDeclareId(String declareId);

    /**
     * 查询参赛申报列表
     * 
     * @param prizeDeclare 参赛申报
     * @return 参赛申报集合
     */
    public List<PrizeDeclare> selectPrizeDeclareList(PrizeDeclare prizeDeclare);

    /**
     * 新增参赛申报
     * 
     * @param prizeDeclare 参赛申报
     * @return 结果
     */
    public int insertPrizeDeclare(PrizeDeclare prizeDeclare);

    /**
     * 修改参赛申报
     * 
     * @param prizeDeclare 参赛申报
     * @return 结果
     */
    public int updatePrizeDeclare(PrizeDeclare prizeDeclare);

    /**
     * 批量删除参赛申报
     * 
     * @param declareIds 需要删除的参赛申报主键集合
     * @return 结果
     */
    public int deletePrizeDeclareByDeclareIds(String declareIds);

    /**
     * 删除参赛申报信息
     * 
     * @param declareId 参赛申报主键
     * @return 结果
     */
    public int deletePrizeDeclareByDeclareId(String declareId);
}
