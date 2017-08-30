<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>支払い方法確認</title>
<link rel="stylesheet" type="text/css" href="CSS/shiharai_takeshita.css">
<link rel="stylesheet" type="text/css"  href="CSS/header.css">
</head>

<body>

<header>

  <a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>

    　　　<a href="login_kato.jsp" class="header_btn">ログイン</a>



    　　　<a href="mypage_enju.jsp" class="header_btn">マイページ</a>



    　　　<a href="cart_jo.jsp" class="header_btn">カート</a>

    　　　<a href="help_togashi.jsp" class="header_btn">ヘルプ</a>

</header>

<div class="main">
        <h3>カード情報の入力</h3>
        ※<strong>お支払い方法はクレジットカードのみとなります。</strong><br/>
        ※半角カナ・全角英数文字は、使用しないでください。<br/>



        <div class="shiharai" >


            <table class="nyuuryoku " border="1" >

               <tr>
           <th>カード会社の選択 　［必須］</th>
           <td><select name="cardselect" id="cardselect">
            <option value="Visa">Visa</option>
            <option value="MasterCard">MasterCard</option>
            <option value="American Express" >American Express</option>
              </select>
           </td>
               </tr>

            <tr>
            <th>カード番号　［必須］</th>
            <td><input type="text" name="card_no1" maxlength="4" onBlur="singlebyte2(card_no1.value,card_no1)" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf">&nbsp;-&nbsp;<input type="text" name="card_no2" onBlur="singlebyte2(card_no2.value,card_no2)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf">&nbsp;-&nbsp;<input type="text" name="card_no3" onBlur="singlebyte2(card_no3.value,card_no3)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf">&nbsp;-&nbsp;<input type="text" name="card_no4" onBlur="singlebyte2(card_no4.value,card_no4)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf"></td>
            </tr>

            <tr>
            <th>カード名義(ローマ字)　［必須］</th>
            <td><input name="cardname" id="cardname" size="25" maxlength="40" value="" >
            </td>　
            </tr>

            <tr>
            <th>有効期限　［必須］</th>
            <td><select name="card_month">
				<option value="">--</option>
				<option value="01" >01</option>
				<option value="02" >02</option>
         		<option value="03" >03</option>
				<option value="04" >04</option>
				<option value="05" >05</option>
				<option value="06" >06</option>
				<option value="07" >07</option>
				<option value="08" >08</option>
				<option value="09" >09</option>
				<option value="10" >10</option>
				<option value="11" >11</option>
				<option value="12" >12</option>
				</select>&nbsp;月/

                <select name="card_year">
				<option value="">--</option>
				<option value="17" >17</option>
				<option value="18" >18</option>
				<option value="19" >19</option>
				<option value="20" >20</option>
				<option value="21" >21</option>
				<option value="22" >22</option>
				<option value="23" >23</option>
				<option value="24" >24</option>
				<option value="25" >25</option>
				<option value="26" >26</option>
				<option value="27" >27</option>
				</select>&nbsp;年</td>
                </tr>

                <tr>
                <th>セキュリティーコード ［必須］</th>
                <td> <input type="password" name="cardsecurity"> </td>
                </tr>

                </table>
                </div>

            <div class="haisousentaku">
            <table class="haisou" border="1" >



            <h3>配達方法の選択</h3>
            <h4>配送料金・・・宅配便500円(税込)　メール便200円(税込)<br/> </h4>
              <tr>
            <th>配送方法［必須］</th>
             <td><label><input type="radio" name="haisou"value="宅配便" >宅配便</label>
            <label><input type="radio" name="haisou" value="メール便">メール便</label>
           　</td>
       　    </tr>

            <tr>
            <th>お届け日指定［必須］</th>
            <td><select name="siteibi" id="siteibi">
            <option value="指定なし">指定なし</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
                </select>
           </td>
                </tr>

             <tr>
            <th>お届け時間指定［必須］</th>
            <td><select name="siteibi" id="siteibi">
            <option value="指定なし">指定なし</option>
            <option value="午前中">午前中</option>
            <option value="12時~14時" >12時~14時</option>
            <option value="14時~16時" >14時~16時</option>
            <option value="16時~18時" >16時~18時</option>
            <option value="18時~20時" >18時~20時</option> <option value="20時~21時" >20時~21時</option>
              </select>
           </td>
                </tr>

            </table>
            </div>



           <p>
           <a href="check_shoji.jsp"><input type="submit" value=内容確認></a>
        　　</p>


    　　　　
    </div>
    </body>
</html>