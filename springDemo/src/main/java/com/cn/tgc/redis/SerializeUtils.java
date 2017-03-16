package com.cn.tgc.redis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerializeUtils {
	private static Logger logger =LoggerFactory.getLogger(SerializeUtils.class);

	/**
	 * 
	 * @Description ���л�
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public static byte[] serialize(Object object) throws Exception {
		if(object == null) return null;
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			// ���л�
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			logger.error(e.toString());
			throw e;
		}
	}

	/**
	 * 
	 * @Description �����л�
	 * @param bytes
	 * @return
	 * @throws Exception
	 */
	public static Object unSerialize(byte[] bytes) throws Exception {
		if(bytes == null) return null;
		ByteArrayInputStream bais = null;
		try {
			// �����л�
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			logger.error(e.toString());
			throw e;
		}
	}
}
