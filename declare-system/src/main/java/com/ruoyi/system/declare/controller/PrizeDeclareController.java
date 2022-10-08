package com.ruoyi.system.declare.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.declare.domain.PrizeDeclare;
import com.ruoyi.system.declare.service.IPrizeDeclareService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 参赛申报Controller
 * 
 * @author ruoyi
 * @date 2022-10-08
 */
@Controller
@RequestMapping("/system/declare")
public class PrizeDeclareController extends BaseController
{
    private String prefix = "system/declare";

    @Autowired
    private IPrizeDeclareService prizeDeclareService;

    @RequiresPermissions("system:declare:view")
    @GetMapping()
    public String declare()
    {
        return prefix + "/declare";
    }

    /**
     * 查询参赛申报列表
     */
    @RequiresPermissions("system:declare:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrizeDeclare prizeDeclare)
    {
        startPage();
        List<PrizeDeclare> list = prizeDeclareService.selectPrizeDeclareList(prizeDeclare);
        return getDataTable(list);
    }

    /**
     * 导出参赛申报列表
     */
    @RequiresPermissions("system:declare:export")
    @Log(title = "参赛申报", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrizeDeclare prizeDeclare)
    {
        List<PrizeDeclare> list = prizeDeclareService.selectPrizeDeclareList(prizeDeclare);
        ExcelUtil<PrizeDeclare> util = new ExcelUtil<PrizeDeclare>(PrizeDeclare.class);
        return util.exportExcel(list, "参赛申报数据");
    }

    /**
     * 新增参赛申报
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存参赛申报
     */
    @RequiresPermissions("system:declare:add")
    @Log(title = "参赛申报", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrizeDeclare prizeDeclare)
    {
        return toAjax(prizeDeclareService.insertPrizeDeclare(prizeDeclare));
    }

    /**
     * 修改参赛申报
     */
    @RequiresPermissions("system:declare:edit")
    @GetMapping("/edit/{declareId}")
    public String edit(@PathVariable("declareId") String declareId, ModelMap mmap)
    {
        PrizeDeclare prizeDeclare = prizeDeclareService.selectPrizeDeclareByDeclareId(declareId);
        mmap.put("prizeDeclare", prizeDeclare);
        return prefix + "/edit";
    }

    /**
     * 修改保存参赛申报
     */
    @RequiresPermissions("system:declare:edit")
    @Log(title = "参赛申报", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrizeDeclare prizeDeclare)
    {
        return toAjax(prizeDeclareService.updatePrizeDeclare(prizeDeclare));
    }

    /**
     * 删除参赛申报
     */
    @RequiresPermissions("system:declare:remove")
    @Log(title = "参赛申报", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prizeDeclareService.deletePrizeDeclareByDeclareIds(ids));
    }
}
