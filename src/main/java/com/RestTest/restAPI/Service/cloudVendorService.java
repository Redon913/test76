package com.RestTest.restAPI.Service;

import java.util.List;

import com.RestTest.restAPI.Model.CloudVendor;

public interface cloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendor();
}
