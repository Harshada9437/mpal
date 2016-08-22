package com.mpal.bo.request.user;

public class UpdaterUserBO {

	private int id;
	private String name;
	private String address;
	private  String mobile;
	private String email;
	private  String gender;
	private String DOB;
	private String latitude;
	private String longitude;
	private String status;

	public int getId() { return id; }

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(final String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UpdaterUserBO)) return false;

		UpdaterUserBO that = (UpdaterUserBO) o;

		if (id != that.id) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (address != null ? !address.equals(that.address) : that.address != null) return false;
		if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
		if (email != null ? !email.equals(that.email) : that.email != null) return false;
		if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
		if (DOB != null ? !DOB.equals(that.DOB) : that.DOB != null) return false;
		if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
		if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
		return status != null ? status.equals(that.status) : that.status == null;

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (gender != null ? gender.hashCode() : 0);
		result = 31 * result + (DOB != null ? DOB.hashCode() : 0);
		result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
		result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "UpdaterUserBO{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", gender='" + gender + '\'' +
				", DOB=" + DOB +
				", latitude='" + latitude + '\'' +
				", longitude='" + longitude + '\'' +
				", status='" + status + '\'' +
				'}';
	}
}
