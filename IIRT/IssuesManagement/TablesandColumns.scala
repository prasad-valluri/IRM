package com.ingestion

object TablesandColumns {
  var columns = ""
  def getcolumns(tablename:String): String ={
    print(tablename)
    if (tablename == "CntrIssue") {
      columns = "(select ISS_TYPE,BUSINESS_AREA,IMPACTED_BUSINESS_AREA,TR_FULL_PATHWAY_NEW,COUNTRY,RISK,ISS_PROCESSNAME,REPORT_TITLE,TO_CHAR(ISS_CREATEDATE,'YYYY-MM-DD HH:MI:SS')ISS_CREATEDATE,ISS_ID,ISS_TITLE,ISS_DESC,ISS_PRIORITY,ISS_STATUS,ISSUE_OWNER,EXCO_MEMBER,TO_CHAR(ISS_DUEDATE,'YYYY-MM-DD HH:MI:SS')ISS_DUEDATE from STIG_PROD.IRM_ISSUE_VIEW) tmp"
  }
    else if (tablename == "CntrActions") {
      columns = "(select ACT_ID,ISSUE_ID,ACT_TITLE,ACT_DESC,ACTIONOWNER,TO_CHAR(ACT_DUEDATE,'YYYY-MM-DD HH:MI:SS')ACT_DUEDATE,ACT_STATUS,TO_CHAR(ACT_CREATEDATE,'YYYY-MM-DD HH:MI:SS')ACT_CREATEDATE,TO_CHAR(ACT_REVDUEDATE,'YYYY-MM-DD HH:MI:SS')ACT_REVDUEDATE,ACT_PROGSTATUS,ACT_ACTAPPROVAL,TO_CHAR(ACT_COMPLDATE,'YYYY-MM-DD HH:MI:SS')ACT_COMPLDATE,ACT_REJREASON from STIG_PROD.IRM_ACTIONS_VIEW) tmp"
    }
      else if (tablename == "RiskEvents") {
      columns = "(select INSTANCENAME_RISK_EVENT,RE_AGGREGATE,RE_AVAGGVAL,RE_BOUNDARY,RE_BOUNDARYIMP,BUSINESS_CRITICALITY_RATING,GROUP_CRITICALITY_RATING,RE_CANCELREASON,RE_CANCELRISKEV,RE_CAPDATE,LINK_CAUSAL_BUSINESS_AREA,LINK_CAUSAL_FACTOR_LEVEL_1,LINK_CAUSAL_FACTOR_LEVEL_2,LINK_CAUSAL_FACTOR_LEVEL_3,LINK_CONTROL_CATEGORY_LEVEL_1,LINK_CONTROL_CATEGORY_LEVEL_2,RE_CONTDESC,RE_CONTFAILTYPE,RE_CUSTDETR,RE_CUSTDETRCOMM,RE_DISCDATE,RE_ESTAMOUNT,RE_ESTAMOUNTCURR,RE_EVENTAPP,RE_EVENTOPEN,RE_EXPECTED,RE_GROSSLOCAMOUNT,LINK_IMPACTED_BUSINESS_AREA,RE_INDFINANCIAL,RE_ISPROCRITICAL,RE_LEGACYID,RE_LEGPRIV,RE_NEARMISS,RE_NETLOSSAM,RE_NFI_COLLEAGUE,RE_NFI_CUSTOMER,RE_NFI_REGULATORY,RE_NFI_REPUTATIONAL,RE_NFI_SERVICE,RE_NOOFEVENTS,RE_OCCDATE,RE_OTHERIMPRISK,RE_OTHERSYSREF,RE_PROCESSNAME,RE_PRODNAME,RE_REASSESSCPA,RE_RECOVERIES,RE_REJREASON,LINK_IMPACTED_RISK_LEVEL_1,LINK_IMPACTED_RISK_LEVEL_2,RE_SINGLEORMULTI,RE_STATUS,LINK_PROCESS_LEVEL_1,LINK_PROCESS_LEVEL_2,RE_SYSTEM,RE_TITLE,RELATIONSHIP_CAPTURER,RELATIONSHIP_INITIATOR,PROCESS_RELATED,PRODUCT_RELATED,RE_GROSSLOSSAM,RE_INITIATED,RE_NFI_RATING,LINK_LOCAL_CURRENCY,LINK_IMPACT_CURRENCY,LINK_OPERATIONAL_RISK_CATEGORY_LEVEL_1,LINK_OPERATIONAL_RISK_CATEGORY_LEVEL_2,LINK_OPERATIONAL_RISK_CATEGORY_LEVEL_3,LINK_PRODUCT_LEVEL_1,LINK_PRODUCT_LEVEL_2,LINK_ORG_LEVEL_2,RELATIONSHIP_APPROVER,RE_RICM_GROFINIMPRATING,RE_EVREOPENED,RE_IS_EXCEPTION,RE_REJFLAG,RE_RICM_BARATING,RE_RICM_BUSFINIMPRATING,RE_RICM_GROUPRATING,RE_VALIDOPRE,LINK_FUNCTION_LEVEL_1,NUMBER_OF_IMPACTS,NUMBER_OF_ISSUES,RE_DESC from STIG_PROD.IRM_RISK_EVENT_VIEW) tmp"
    }
    else{

    }
    columns
  }
}