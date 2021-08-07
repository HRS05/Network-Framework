package com.my.pack.nframework.common;
import com.google.gson.*;
public class JSONUtil
{
private JSONUtil(){}
public static String toJSON(java.io.Serializable serializable)
{
try
{
Gson gson=new Gson();
return gson.toJson(serializable);
}catch(Exception e)
{
return "{}";
}
}//funtion ends

/*
explaination of below method use (hint)
Bulb b=JSONUtil.fromJSON(someString,Bulb.class);
*/
public static <T> T fromJSON(String jsonString,Class<T> c)
{
try
{
Gson gson=new Gson();
return gson.fromJson(jsonString,c);
}catch(Exception e)
{
return null;
}
}//funtion ends

}//class ends