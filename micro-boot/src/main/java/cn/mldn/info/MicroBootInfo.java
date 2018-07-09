package cn.mldn.info;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class MicroBootInfo implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("company.name", "mldn") ;
		builder.withDetail("version", "1.0") ;
		builder.withDetail("author", "天天爱唱歌") ;
	}

}
