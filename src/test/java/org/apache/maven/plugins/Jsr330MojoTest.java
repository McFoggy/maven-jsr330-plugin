package org.apache.maven.plugins;

import javax.inject.Inject;

import org.apache.maven.plugin.MojoExecutionException;

public class Jsr330MojoTest extends AbstractJsr330TestCase {
	@Inject Jsr330Mojo mojo;
	
	public void test_mojo_execution() throws MojoExecutionException {
		mojo.execute();
	}
}
