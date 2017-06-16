/**
 * 说明:
 *
 * @author xiaoting
 *         Created by 2017-06-15 15:43
 **/
public class Test {
     public static void main(String[] args) {
        String rest = HttpClientUtil.getHttps("https://lsp.wuliu.taobao.com/locationservice/addr/output_address_town_array.do?l1=110000&l2=110100&l3=110101");
         System.out.println("rest = [" + rest + "]");

    }
}
