module acmeair.services {
	requires java.base;
	requires java.naming;

	requires transitive java.logging;

	exports com.acmeair;
	exports com.acmeair.util;
	exports com.acmeair.service;
	exports com.acmeair.web.dto;
}
