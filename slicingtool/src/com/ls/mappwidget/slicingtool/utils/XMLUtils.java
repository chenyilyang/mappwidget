package com.ls.mappwidget.slicingtool.utils;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class XMLUtils
{
	public static Document createDoc()
	{
		Document document = null;
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try
		{
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			document = docBuilder.newDocument();
		} catch (ParserConfigurationException e)
		{
			e.printStackTrace();
		}

		return document;
	}

	public static void saveDoc(Document doc, String fileName)
	{
		try
		{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(new File(fileName));
			transformer.transform(source, result);
		} catch (TransformerException e)
		{
			e.printStackTrace();
		}
	}
}
