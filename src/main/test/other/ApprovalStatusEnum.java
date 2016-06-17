package other;


/**
 * 工作流状态枚举
 *
 * @author 丁旭
 * @E-mail <a href="mailto:dingxu@sjgtw.com"/>
 * @date 2016-05-09
 */
public enum ApprovalStatusEnum  {
	ORDINARY("无状态",0),
	IN_EDIT("编制中",10),
	IN_AUDIT("审核中",20),
	PASSED("已批准",30),
	REJECTED("已驳回",50),

    //todo 工作流审核状态
    ;

    /******************************
     * 以下基础设置
     **************************************/
    private String display;
    private int code;

    // 构造方法
    ApprovalStatusEnum(String display, int code) {
        this.display = display;
        this.code = code;
    }




    public int getCode() {
        return this.code;
    }

    public String getValue() {
        return name();
    }

    /**
     * 根据code获得名称
     *
     * @param code
     * @return
     */
    public static ApprovalStatusEnum fromCode(int code) {
    	ApprovalStatusEnum[] codes = ApprovalStatusEnum.values();
        for (ApprovalStatusEnum state : codes) {
            if (state.getCode() == code) {
                return state;
            }
        }
        return null;
    }

    // 覆盖方法
    @Override
    public String toString() {
        return this.display;
    }

    public String getDisplay() {
        return display;
    }
}
