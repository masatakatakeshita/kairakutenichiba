/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.AdminHelpDAO;
import com.internousdev.kairakutenichiba.dto.AdminHelpDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * @author internousdev
 *
 */
public class AdminHelpAction  extends ActionSupport implements SessionAware{


	    /**
	     *シリアルID
	     */
	    private static final long serialVersionUID = 7307749500088925358L;

	    /**
	     *ユーザー名
	     */
	    private String userName;

	    /**
	     * 住所
	     */
	    private String userAddress;


	    /**
	     *メールアドレス
	     */
	    private String userMail;


	    /**
	     *問い合わせ種類
	     */
	    private String category;

	    /**
	     *問い合わせ内容
	     */
	    private String comment;


	    /**
	     * 対応状況
	     */
        private String isDeleted;

	    /**
	     *セッション情報
	     */
	    private Map<String, Object> session;



	    /**
	     * 実行メソッド
	     * 処理内容と順番
	     * 1：リスト化
	     * 2：session確認
	     * 3：サクセスで値を返す
	     */
	    public String execute() {
	        String result = ERROR;

	        ArrayList<AdminHelpDTO> allList = new ArrayList<AdminHelpDTO>();
	        AdminHelpDAO dao = new AdminHelpDAO();

	        String searchName;
	        if(userName!=null){
	            searchName = userName;
	        }else {
	            searchName = "";
	        }
	        String searchDeleted;
	        if(isDeleted!=null){
	            searchDeleted = (String) isDeleted;
	        }else {
	            searchDeleted = "";
	        }

	        allList = dao.display(searchName,searchDeleted);

	        session.put("userList", allList);
	        result = SUCCESS;
	        return result;

	    }

	    /**
	     * 氏名を取得するメソッド
	     * @return userName ユーザー名
	     */
	    public String getUserName() {
	        return userName;
	    }

	    /**
	     * 氏名を格納するメソッド
	     * @param userName ユーザー名
	     */
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	   /**
	    * 住所を取得するメソッド
	    */
	   public String getUserAddress() {
		   return userAddress;
	   }

	   /**
	    * 住所を格納するメソッド
	    */
	   public void serUserAddress(String userAddress) {
		   this.userAddress = userAddress;
	   }


	    /**
	     * メールアドレスを取得するメソッド
	     * @return userMail メールアドレス
	     */
	    public String getUserMail() {
	        return userMail;
	    }

	    /**
	     * メールアドレスを格納するメソッド
	     * @param userMail メールアドレス
	     */
	    public void setUserMail(String userMail) {
	        this.userMail = userMail;
	    }

	    /**
	     * 問い合わせ種類を取得するメソッド
	     * @return category 種類
	     */
	    public String setCategory() {
	        return category;
	    }

	    /**
	    * 問い合わせ種類を格納するメソッド
	    * @param category 種類
	    */
	    public void setCategory(String category) {
	        this.category = category;
	    }

	    /**
	    *お問い合わせ内容を取得すメソッド
	    *@return comment 内容
	    */
	    public String getComment() {
	        return comment;
	    }

	    /**
	    * お問い合わせ内容を格納するメソッド
	    * @param comment 内容
	    */
	    public void setComment(String comment) {
	        this.comment = comment;
	    }

	    /**
	     *対応状況を取得すメソッド
	     *@return isDeleted 対応状況
	     */
	    public String getIsDeleted() {
	        return (String) isDeleted;
	    }
	    /**
	     * 対応状況を格納するメソッド
	     * @param isDeleted 対応状況
	     */
	    public void setIsDeleted(String isDeleted) {
	        this.isDeleted = isDeleted;
	    }

	    /**
	     * sessionを格納するメソッド
	     * @return session セッション
	     */
	     public Map<String, Object> getSession() {
	         return session;
	     }

	     /**
	     *  sessionを格納するメソッド
	     * @param session セッショ
	     */
	     public void setSession(Map<String, Object> session) {
	         this.session = session;




		}


		}
