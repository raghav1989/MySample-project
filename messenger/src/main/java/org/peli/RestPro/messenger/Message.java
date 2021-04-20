package org.peli.RestPro.messenger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	

		private int msgdb_id;
		private String queue_id;
		private String message_no;
		private String messageclass_type;
		private String status;
		private String input_date;
		private String input_time;
		private String currentqueuein_date;
		private String currentqueuein_time;
		private String prevqueuein_date;
		
		public Message() {
			//super();
		}

		public Message(int msgdb_id, String queue_id, String message_no, String messageclass_type, String status,
				String input_date, String input_time, String currentqueuein_date, String currentqueuein_time,
				String prevqueuein_date) {
			//super();
			this.msgdb_id = msgdb_id;
			this.queue_id = queue_id;
			this.message_no = message_no;
			this.messageclass_type = messageclass_type;
			this.status = status;
			this.input_date = input_date;
			this.input_time = input_time;
			this.currentqueuein_date = currentqueuein_date;
			this.currentqueuein_time = currentqueuein_time;
			this.prevqueuein_date = prevqueuein_date;
		}

		public int getMsgdb_id() {
			return msgdb_id;
		}

		public void setMsgdb_id(int msgdb_id) {
			this.msgdb_id = msgdb_id;
		}

		public String getQueue_id() {
			return queue_id;
		}

		public void setQueue_id(String queue_id) {
			this.queue_id = queue_id;
		}

		public String getMessage_no() {
			return message_no;
		}

		public void setMessage_no(String message_no) {
			this.message_no = message_no;
		}

		public String getMessageclass_type() {
			return messageclass_type;
		}

		public void setMessageclass_type(String messageclass_type) {
			this.messageclass_type = messageclass_type;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInput_date() {
			return input_date;
		}

		public void setInput_date(String input_date) {
			this.input_date = input_date;
		}

		public String getInput_time() {
			return input_time;
		}

		public void setInput_time(String input_time) {
			this.input_time = input_time;
		}

		public String getCurrentqueuein_date() {
			return currentqueuein_date;
		}

		public void setCurrentqueuein_date(String currentqueuein_date) {
			this.currentqueuein_date = currentqueuein_date;
		}

		public String getCurrentqueuein_time() {
			return currentqueuein_time;
		}

		public void setCurrentqueuein_time(String currentqueuein_time) {
			this.currentqueuein_time = currentqueuein_time;
		}

		public String getPrevqueuein_date() {
			return prevqueuein_date;
		}

		public void setPrevqueuein_date(String prevqueuein_date) {
			this.prevqueuein_date = prevqueuein_date;
		}
		
		}

