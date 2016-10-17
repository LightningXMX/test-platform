package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by mingxin on 16/8/23.
 */
public class Test1 {

    public static void main(String[] args) {
        String jsonString = getJsonString1();
        JSONObject jsonObject = JSON.parseObject(jsonString);
        System.out.println(jsonObject);
        String total = jsonObject.getString("total");
        Long total2 = jsonObject.getLong("total");
        JSONArray dataArray = jsonObject.getJSONArray("data");
        dataArray.getJSONObject(1);


        for (Object o : dataArray) {
            JSONObject O = o instanceof JSONObject?(JSONObject)o:(JSONObject)JSON.toJSON(o);
            System.out.println(o);
            String image = O.getString("image");
            System.out.println(image);
        }

    }
    private static String getJsonString1() {
        return
                "\n" +
                        "{\n" +
                        "\t\"status\":1,\n" +
                        "\t\"pageTotal\":\"6\",\n" +
                        "\t\"pageSize\":\"4\",\n" +
                        "\t\"pageNum\":\"0\",\n" +
                        "\t\"total\":\"23\",\n" +
                        "    \"data\":[\n" +
                        "\t\t\t{\n" +
                        "\t\t\"id\":\"30001682\",\n" +
                        "\t\t\"tag\":[\n" +
                        "\t\t\t\t\t\t\t\"高科技\"\t\t\t\t\t],\n" +
                        "    \"image\":\"//img.daily.taobaocdn.net/tfscom/TB1I7b7XXXXXXbfXpXXwu0bFXXX\",\n" +
                        "    \"recommendPriceStr\":\"\",\n" +
                        "    \"curr_money\":\"0\",\n" +
                        "    \"buy_amount\":\"0\",\n" +
                        "    \"finish_per\":\"0\",\n" +
                        "    \"remain_day\":\"0\",\n" +
                        "    \"status\":\"计划中\",\n" +
                        "    \"status_value\":\"0\",\n" +
                        "    \"target_money\":\"2222.00\",\n" +
                        "    \"begin_date\":\"\",\n" +
                        "    \"end_date\":\"\",\n" +
                        "\n" +
                        "    \"focus_count\":\"0\",\n" +
                        "    \"category_id\":\"121834097\",\n" +
                        "    \"seek_days\":\"\",\n" +
                        "    \"plan_date\":\"\",\n" +
                        "    \"plan_end_date\":\"\",\n" +
                        "\n" +
                        "\t\t\n" +
                        "\t\t        \"project_status\":\"计划中\",\n" +
                        "        \"tip_msg\":\"\",\n" +
                        "        \"update_status\":\"\",\n" +
                        "        \"user_status\":\"\",\n" +
                        "        \"can_update\":1,\n" +
                        "        \"update_url\":\"//izhongchou.daily.taobao.net/dream/addProject.htm?id=30001682\",\n" +
                        "        \"can_publish\":0,\n" +
                        "        \"publish_url\":\"//izhongchou.daily.taobao.net/dream/ajax/publishProject.htm?id=30001682&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_change\":0,\n" +
                        "        \"change_url\":\"//izhongchou.daily.taobao.net/dream/updateProject.htm?id=30001682\",\n" +
                        "        \"can_confirm_change\":0,\n" +
                        "        \"confirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmUpdateProject.htm?id=30001682&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_seek\":0,\n" +
                        "        \"seek_url\":\"//izhongchou.daily.taobao.net/dream/seekProject.htm?id=30001682\",\n" +
                        "        \"can_confirm_seek\":0,\n" +
                        "        \"seek_comfirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmSeekProject.htm?id=30001682&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_pledge\":0,\n" +
                        "        \"pledge_url\":\"http://izhongchou.daily.taobao.net/dream/ship.htm?project_id=30001682\",\n" +
                        "        \"pledge_days\":\"\",\n" +
                        "        \"can_publish_faq\":0,\n" +
                        "        \"publish_faq_url\":\"//izhongchou.daily.taobao.net/dream/projectFaq.htm?projectId=30001682\",\n" +
                        "\n" +
                        "        \"product_list\":[\n" +
                        "                    ],\n" +
                        "\t\t\n" +
                        "\t\t\t\t        \"link\":\"//izhongchou.daily.taobao.net/dreamdetail.htm?id=30001682\",\n" +
                        "\t\t        \"name\":\"入淘测试项目1\",\n" +
                        "\t\t\"show_order\":\"//trade.daily.taobao.net/trade/itemlist/list_sold_items.htm\"\n" +
                        "    },\t\t{\n" +
                        "\t\t\"id\":\"30001671\",\n" +
                        "\t\t\"tag\":[\n" +
                        "\t\t\t\t\t\t\t\"测试项目\"\t\t\t\t\t],\n" +
                        "    \"image\":\"//img.daily.taobaocdn.net/tfscom/TB1Kxz4XXXXXXXZXpXXxKNpFXXX\",\n" +
                        "    \"recommendPriceStr\":\"\",\n" +
                        "    \"curr_money\":\"0\",\n" +
                        "    \"buy_amount\":\"0\",\n" +
                        "    \"finish_per\":\"0\",\n" +
                        "    \"remain_day\":\"0\",\n" +
                        "    \"status\":\"计划中\",\n" +
                        "    \"status_value\":\"0\",\n" +
                        "    \"target_money\":\"2222.00\",\n" +
                        "    \"begin_date\":\"\",\n" +
                        "    \"end_date\":\"\",\n" +
                        "\n" +
                        "    \"focus_count\":\"0\",\n" +
                        "    \"category_id\":\"121834097\",\n" +
                        "    \"seek_days\":\"\",\n" +
                        "    \"plan_date\":\"\",\n" +
                        "    \"plan_end_date\":\"\",\n" +
                        "\n" +
                        "\t\t\n" +
                        "\t\t        \"project_status\":\"计划中\",\n" +
                        "        \"tip_msg\":\"\",\n" +
                        "        \"update_status\":\"\",\n" +
                        "        \"user_status\":\"\",\n" +
                        "        \"can_update\":1,\n" +
                        "        \"update_url\":\"//izhongchou.daily.taobao.net/dream/addProject.htm?id=30001671\",\n" +
                        "        \"can_publish\":0,\n" +
                        "        \"publish_url\":\"//izhongchou.daily.taobao.net/dream/ajax/publishProject.htm?id=30001671&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_change\":0,\n" +
                        "        \"change_url\":\"//izhongchou.daily.taobao.net/dream/updateProject.htm?id=30001671\",\n" +
                        "        \"can_confirm_change\":0,\n" +
                        "        \"confirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmUpdateProject.htm?id=30001671&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_seek\":0,\n" +
                        "        \"seek_url\":\"//izhongchou.daily.taobao.net/dream/seekProject.htm?id=30001671\",\n" +
                        "        \"can_confirm_seek\":0,\n" +
                        "        \"seek_comfirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmSeekProject.htm?id=30001671&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_pledge\":0,\n" +
                        "        \"pledge_url\":\"http://izhongchou.daily.taobao.net/dream/ship.htm?project_id=30001671\",\n" +
                        "        \"pledge_days\":\"\",\n" +
                        "        \"can_publish_faq\":0,\n" +
                        "        \"publish_faq_url\":\"//izhongchou.daily.taobao.net/dream/projectFaq.htm?projectId=30001671\",\n" +
                        "\n" +
                        "        \"product_list\":[\n" +
                        "                    ],\n" +
                        "\t\t\n" +
                        "\t\t\t\t        \"link\":\"//izhongchou.daily.taobao.net/dreamdetail.htm?id=30001671\",\n" +
                        "\t\t        \"name\":\"明新测试项目3\",\n" +
                        "\t\t\"show_order\":\"//trade.daily.taobao.net/trade/itemlist/list_sold_items.htm\"\n" +
                        "    },\t\t{\n" +
                        "\t\t\"id\":\"30001669\",\n" +
                        "\t\t\"tag\":[\n" +
                        "\t\t\t\t\t\t\t\"测试项目\"\t\t\t\t\t],\n" +
                        "    \"image\":\"//img.daily.taobaocdn.net/tfscom/TB1OxP4XXXXXXaYXXXXxKNpFXXX\",\n" +
                        "    \"recommendPriceStr\":\"22,220\",\n" +
                        "    \"curr_money\":\"0\",\n" +
                        "    \"buy_amount\":\"0\",\n" +
                        "    \"finish_per\":\"0\",\n" +
                        "    \"remain_day\":\"0\",\n" +
                        "    \"status\":\"筹款中\",\n" +
                        "    \"status_value\":\"4\",\n" +
                        "    \"target_money\":\"2222.00\",\n" +
                        "    \"begin_date\":\"2016/06/29\",\n" +
                        "    \"end_date\":\"2016/07/22\",\n" +
                        "\n" +
                        "    \"focus_count\":\"0\",\n" +
                        "    \"category_id\":\"121834097\",\n" +
                        "    \"seek_days\":\"0\",\n" +
                        "    \"plan_date\":\"\",\n" +
                        "    \"plan_end_date\":\"\",\n" +
                        "\n" +
                        "\t\t\n" +
                        "\t\t        \"project_status\":\"筹款中\",\n" +
                        "        \"tip_msg\":\"\",\n" +
                        "        \"update_status\":\"变更状态：审核通过\",\n" +
                        "        \"user_status\":\"\",\n" +
                        "        \"can_update\":0,\n" +
                        "        \"update_url\":\"//izhongchou.daily.taobao.net/dream/addProject.htm?id=30001669\",\n" +
                        "        \"can_publish\":0,\n" +
                        "        \"publish_url\":\"//izhongchou.daily.taobao.net/dream/ajax/publishProject.htm?id=30001669&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_change\":0,\n" +
                        "        \"change_url\":\"//izhongchou.daily.taobao.net/dream/updateProject.htm?id=30001669\",\n" +
                        "        \"can_confirm_change\":1,\n" +
                        "        \"confirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmUpdateProject.htm?id=30001669&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_seek\":0,\n" +
                        "        \"seek_url\":\"//izhongchou.daily.taobao.net/dream/seekProject.htm?id=30001669\",\n" +
                        "        \"can_confirm_seek\":0,\n" +
                        "        \"seek_comfirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmSeekProject.htm?id=30001669&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_pledge\":0,\n" +
                        "        \"pledge_url\":\"http://izhongchou.daily.taobao.net/dream/ship.htm?project_id=30001669\",\n" +
                        "        \"pledge_days\":\"20\",\n" +
                        "        \"can_publish_faq\":1,\n" +
                        "        \"publish_faq_url\":\"//izhongchou.daily.taobao.net/dream/projectFaq.htm?projectId=30001669\",\n" +
                        "\n" +
                        "        \"product_list\":[\n" +
                        "                    ],\n" +
                        "\t\t\n" +
                        "\t\t\t\t        \"link\":\"//izhongchou.daily.taobao.net/dreamdetail.htm?id=30001669\",\n" +
                        "\t\t        \"name\":\"明新测试项目2\",\n" +
                        "\t\t\"show_order\":\"//trade.daily.taobao.net/trade/itemlist/list_sold_items.htm\"\n" +
                        "    },\t\t{\n" +
                        "\t\t\"id\":\"30001666\",\n" +
                        "\t\t\"tag\":[\n" +
                        "\t\t\t\t\t\t\t\"测试项目\"\t\t\t\t\t],\n" +
                        "    \"image\":\"//img.daily.taobaocdn.net/tfscom/TB1Mxf4XXXXXXb0XpXXxKNpFXXX\",\n" +
                        "    \"recommendPriceStr\":\"22,220\",\n" +
                        "    \"curr_money\":\"0\",\n" +
                        "    \"buy_amount\":\"0\",\n" +
                        "    \"finish_per\":\"0\",\n" +
                        "    \"remain_day\":\"0\",\n" +
                        "    \"status\":\"筹款中\",\n" +
                        "    \"status_value\":\"4\",\n" +
                        "    \"target_money\":\"2222.00\",\n" +
                        "    \"begin_date\":\"2016/06/30\",\n" +
                        "    \"end_date\":\"2016/07/23\",\n" +
                        "\n" +
                        "    \"focus_count\":\"0\",\n" +
                        "    \"category_id\":\"121834097\",\n" +
                        "    \"seek_days\":\"0\",\n" +
                        "    \"plan_date\":\"\",\n" +
                        "    \"plan_end_date\":\"\",\n" +
                        "\n" +
                        "\t\t\n" +
                        "\t\t        \"project_status\":\"筹款中\",\n" +
                        "        \"tip_msg\":\"\",\n" +
                        "        \"update_status\":\"变更状态：已保存\",\n" +
                        "        \"user_status\":\"\",\n" +
                        "        \"can_update\":0,\n" +
                        "        \"update_url\":\"//izhongchou.daily.taobao.net/dream/addProject.htm?id=30001666\",\n" +
                        "        \"can_publish\":0,\n" +
                        "        \"publish_url\":\"//izhongchou.daily.taobao.net/dream/ajax/publishProject.htm?id=30001666&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_change\":1,\n" +
                        "        \"change_url\":\"//izhongchou.daily.taobao.net/dream/updateProject.htm?id=30001666\",\n" +
                        "        \"can_confirm_change\":0,\n" +
                        "        \"confirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmUpdateProject.htm?id=30001666&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_seek\":0,\n" +
                        "        \"seek_url\":\"//izhongchou.daily.taobao.net/dream/seekProject.htm?id=30001666\",\n" +
                        "        \"can_confirm_seek\":0,\n" +
                        "        \"seek_comfirm_change_url\":\"//izhongchou.daily.taobao.net/dream/ajax/comfirmSeekProject.htm?id=30001666&_tb_token_=e4176bee8dd8e\",\n" +
                        "        \"can_pledge\":0,\n" +
                        "        \"pledge_url\":\"http://izhongchou.daily.taobao.net/dream/ship.htm?project_id=30001666\",\n" +
                        "        \"pledge_days\":\"22\",\n" +
                        "        \"can_publish_faq\":1,\n" +
                        "        \"publish_faq_url\":\"//izhongchou.daily.taobao.net/dream/projectFaq.htm?projectId=30001666\",\n" +
                        "\n" +
                        "        \"product_list\":[\n" +
                        "                    ],\n" +
                        "\t\t\n" +
                        "\t\t\t\t        \"link\":\"//izhongchou.daily.taobao.net/dreamdetail.htm?id=30001666\",\n" +
                        "\t\t        \"name\":\"明新测试项目1\",\n" +
                        "\t\t\"show_order\":\"//trade.daily.taobao.net/trade/itemlist/list_sold_items.htm\"\n" +
                        "    }\t\t]\n" +
                        "}\n";
    }
}
