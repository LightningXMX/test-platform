package json
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONArray
import com.alibaba.fastjson.JSONObject

/**
 * Created by mingxin on 16/8/23.
 */

def getString1(){
    return "{\n" +
            "  \"Array\": [\n" +
            "    1,\n" +
            "    2,\n" +
            "    3\n" +
            "  ],\n" +
            "  \"Boolean\": true,\n" +
            "  \"Null\": null,\n" +
            "  \"Number\": 123,\n" +
            "  \"Object\": {\n" +
            "    \"a\": \"b\",\n" +
            "    \"c\": \"d\"\n" +
            "  },\n" +
            "  \"String\": \"Hello World\"\n" +
            "}"
}

String string = "{\n" +
        "  \"Array\": [\n" +
        "    1,\n" +
        "    2,\n" +
        "    3\n" +
        "  ],\n" +
        "  \"Boolean\": true,\n" +
        "  \"Null\": null,\n" +
        "  \"Number\": 123,\n" +
        "  \"Object\": {\n" +
        "    \"a\": \"b\",\n" +
        "    \"c\": \"d\"\n" +
        "  },\n" +
        "  \"String\": \"Hello World\"\n" +
        "}"
println string
JSONObject jsonObject = JSON.parseObject(string)
println jsonObject
String string1 = getString1()
println string1
