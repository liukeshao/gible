package xyz.gosick.gible.trade.client.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ks
 */
@Data
public class User implements Serializable {
	private Long id;
	private String name;
	private Integer age;
}
