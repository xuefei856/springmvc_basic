package com.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SettlementBills {
    /**
     *
     */
    private Long id;

    /**
     * 结算单名称
     */
    private String settlementBillsName;

    /**
     * 标段id
     */
    private Long sectionId;

    /**
     * 标段名称
     */
    private String sectionName;

    /**
     * 发货单IDs，逗号分隔多个
     */
    private String dispatchBillIds;

    /**
     * 质保金（%）
     */
    private Double guarantee;

    /**
     * 预付款金额（%）
     */
    private Double amountInAdvance;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 供应商名称
     */
    private String supplier;

    /**
     * 物资设备类别（0：甲供物资；1：联采物资）
     */
    private Integer materialType;

    /**
     * 状态。枚举（0：编制中；1：审核中；2：已批准； 3;已驳回 4：已结算;）
     */
    private Integer approvalStatus;

    /**
     * 驳回信息
     */
    private String remark;

    /**
     * 是否生成了服务费
     */
    private Integer isGenerateServiceCharge;

    /**
     * 创建人id
     */
    private Long createrId;

    /**
     * 创建人名称
     */
    private String createName;

    /**
     * 运杂费(所选发货单运费汇总)
     */
    private Double totalTransportFees;

    /**
     * 申请预付款金额（所选发货单总货款+运杂费 - 质量保证金 - 预付款金额 ）
     */
    private Double applyPaymentFees;

    /**
     * 总货款(所选发货单商品的货款金额汇总)
     */
    private Double totalGoodsMoney;

    /**
     * 更新次数
     */
    private Integer updateCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 结算完成时间
     */
    private Date finishTime;

    /**
     * 删除状态0存在1已删除
     */
    private Integer deleted;

    /**
     * 来源
     */
    private Long source;

    /**
     *
     */
    private Integer businessState;

    /**
     *
     */
    private String businessWorkflowType;

    /**
     *
     */
    private String businessObjectType;

    /**
     *
     */
    private Long businessId;

    /**
     * 所属指挥部id
     */
    private Long projectManagerId;
}