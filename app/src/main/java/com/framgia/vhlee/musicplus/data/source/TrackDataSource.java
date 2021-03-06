package com.framgia.vhlee.musicplus.data.source;

import com.framgia.vhlee.musicplus.data.model.Track;

import java.util.List;

public interface TrackDataSource {
    interface DataCallback<T> {
        void onSuccess(List<T> datas);

        void onFail(String mesage);
    }

    interface Local {
        void getOfflineTracks(DataCallback<Track> callback);

        void getFavotiteTracks(DataCallback<Track> callback);

        void addFavariteTrack(Track track, DataCallback<Boolean> callback);

        void deleteFavoriteTrack(Track track, DataCallback<Boolean> callback);

        void getRecentTrack(DataCallback<Long> callback);
    }

    interface Remote extends TrackDataSource {
        void getTracks(String api, DataCallback<Track> callback);

        void searchTracks(String api, DataCallback<Track> callback);

        void getDetailTrack(String api, DataCallback<Track> callback);
    }
}
