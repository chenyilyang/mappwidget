package com.ls.mappwidget.slicingtool.utils;

import java.io.File;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

public class EclipseUtils
{
	private EclipseUtils()
	{
	}

	public static File getCurrentWorkspace()
	{
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();

		IPath location = root.getLocation();
		location.toFile();

		return location.toFile();
	}
}
