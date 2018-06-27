package com.czd.module;
import javax.xml.parsers.*;

import com.czd.module.factory.factory.FactoryAdd;
import com.czd.module.factory.factory.IFactory;
import org.w3c.dom.*;

import java.io.*;
/**
 * 反射注入xml配置
 *
 * @author: czd
 * @create: 2018/3/8 15:00
 */
public class XmlUtils {
    public static Object getBean() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
