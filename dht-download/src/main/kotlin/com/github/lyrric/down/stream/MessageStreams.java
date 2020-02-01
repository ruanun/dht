package com.github.lyrric.down.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageStreams {

	@Input("download-message")
	MessageChannel downloadMessageInput();

	@Output("torrent-message")
	MessageChannel torrentMessageOutput();

}
