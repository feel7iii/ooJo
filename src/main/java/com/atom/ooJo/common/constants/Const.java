package com.atom.ooJo.common.constants;

public class Const {

	// public static long UPLOAD_MAX_SIZE = 15 * 1024 * 1024;
	// public static String UPLOAD_MAX_SIZE_INFO =
	// UPLOAD_MAX_SIZE/(1024*1024)+"M";
	// public static String UPLOAD_MORE_THAN_MAXSIZE_INFO =
	// "上传文件超长!\\n上传文件的长度不要超过"+UPLOAD_MAX_SIZE_INFO+"，现在文件的长度是";
	public static final String UPLOAD_UNIT = "字节";
	public static final String UPLOAD_TEMP_PATH = "tempUploadFiles/part";
	public static final String UPLOAD_TEMP_ATTR_PATH = "tempUploadFiles/part/attr/";
	public static final String UPLOAD_IMPORT_TEMP_PATH = "import";
	public static final String PROJECT_NAME = "manageweb/";
	public static final String WEB_COMPONENT_PAGE_SNAPSHOT_PATH = "/webPageSnapShot/component";
	public static final String WEB_PATTERN_PAGE_SNAPSHOT_PATH = "/webPageSnapShot/pattern";
	public static final String UPLOAD_ACTION_PATH = "/manageweb/edit.content.StreamOutPartsAction.action";

	public static final String UPLOAD_BIG_IMAGE = "type---bigImage--cms--6";

	public static final long MILLISECOND_ONE_SECOND = 1000L;
	public static final long MILLISECOND_ONE_MINUTE = MILLISECOND_ONE_SECOND * 60;
	public static final long MILLISECOND_ONE_HOUR = MILLISECOND_ONE_MINUTE * 60;
	public static final long MILLISECOND_ONE_DAY = MILLISECOND_ONE_HOUR * 24;
	public static final long MILLISECOND_HALF_MINUTE = MILLISECOND_ONE_SECOND * 30;
	public static final long MILLISECOND_TEN_MINUTES = MILLISECOND_ONE_MINUTE * 10;

	// public static long UPLOAD_MAX_TITLE_PIC_SIZE = 1 * 1024 * 1024;
	// public static String UPLOAD_MAX_TITLE_PIC_SIZE_INFO =
	// UPLOAD_MAX_TITLE_PIC_SIZE/(1024*1024)+"M";
	// public static String UPLOAD_MORE_THAN_MAXSIZE_TITLE_PIC_INFO =
	// "上传文件超长!\\n上传文件的长度不要超过"+UPLOAD_MAX_TITLE_PIC_SIZE_INFO+",现在文件的长度是";

	public static final String FCK_REF_RESOURCE_TYPE = "editor";

	public static final String INIT_LOAD_PROPERTY_FILENAME = "config.properties";
	public static final String INIT_LOAD_PROPERTY_FILENAME_BAK = "config.properties.bak";
	public static final String IS_RSYNC_FILE = "isRsyncFile";

	public static final long UPLOAD_MAX_LICENSE_SIZE = 10 * 1024;
	public static final String UPLOAD_MORE_THAN_MAXSIZE_LICENSE_INFO = "上传文件超长!\\n上传文件的长度不要超过10KB，现在文件的长度是";
	public static final String UPLOAD_SNAPSHOT_FILE = "uploadSnapshot";

	public static final String MAX_ID_PATH = System.getProperty("user.dir") + "\\SomeData.properties";

	public static final String NEWEST_DATE_ARTI = System.getProperty("user.dir") + "\\ooJo\\SomeData.properties";

	// 文件上传路径
	public static final String UPLOADTEMP = "D:/UPLOADTEMP/";

	// 每页数量
	public static final int PAGE_SIZE = 3;

	// 分页按钮个数
	public static final int PAGINATIONSIZE = 5;

	public static final int CURRENTINDEX = 0;
	public static final int BEGININDEX = 0;
	public static final int ENDINDEX = 0;
}
